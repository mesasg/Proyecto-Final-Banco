const mariadb = require('mariadb');

const pool = mariadb.createPool({
    host: 3306 ,
    user: 'root',
    password: 'root',
    database: 'mySQL',
    connectionLimit: 5
});

module.exports = pool;