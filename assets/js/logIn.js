const express = require('express');
const pool = require('./db');
const path = require('path');

const app = express();

app.use(express.json());
app.use(express.static(path.join(__dirname, 'tatic')));

app.post('/login', async (req, res) => {
    const { username, password } = req.body;

    try {
        const connection = await pool.getConnection();
        const query = 'SELECT * FROM users WHERE username =? AND password =?';
        const result = await connection.query(query, [username, password]);

        if (result.length > 0) {
            res.redirect('/index'); // Redirect to /index route
        } else {
            res.status(401).json({ success: false, message: 'Invalid username or password' });
        }

        connection.release();
    } catch (error) {
        console.error(error);
        res.status(500).json({ success: false, message: 'Server error' });
    }
});

app.get('/index', function(request, response) {
    // Render index.html template
    response.sendFile(path.join(__dirname + '/index.html'));
});

app.get('/', function(request, response) {
    // Render login template
    response.sendFile(path.join(__dirname + '/login.html'));
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});