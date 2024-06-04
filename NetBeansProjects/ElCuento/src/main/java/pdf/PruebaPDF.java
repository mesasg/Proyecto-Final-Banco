/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import com.itextpdf.text.pdf.*;
import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
/**
 *
 * @author 
 */
public class PruebaPDF {
    public static void crearBlog(String nombre, String id, String tel, String correo) throws IOException{ //Parametro info moto
        try{
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("PruebaFactura.pdf"));
        doc.open();
        
        String costumerInfo ="Nombre: "+nombre+"\nID: "+id+"\nTelefono: "+tel+"\nCorreo: "+correo;
        double precioMoto = 122000000;
        Paragraph body = new Paragraph(costumerInfo);
        Image imagen = Image.getInstance("encabezadobmw.png");
        PdfPTable table = new PdfPTable(3);
        
        
        imagen.scaleAbsolute(525, 45);
        body.setSpacingAfter(20);
        body.setSpacingBefore(20);
        table.setSpacingBefore(10);
        
        table.addCell("Cantidad");
        table.addCell("Descripcion");
        table.addCell("Precio");
        
        table.addCell("1");
        table.addCell("BMW S" + "\n[K47] [FL] 1000 R MT 1000CC");
        table.addCell(String.valueOf(precioMoto));
        
        PdfPCell subtotal = new PdfPCell(new Paragraph("Subtotal"));
        subtotal.setColspan(2);
        table.addCell(subtotal);
        table.addCell(String.valueOf(precioMoto));
        PdfPCell costoIVA = new PdfPCell(new Paragraph("IVA 19%"));
            
        costoIVA.setColspan(2);
        table.addCell(costoIVA);
        double ivaCosto = calculateIVA(precioMoto);
        table.addCell(String.valueOf(ivaCosto));
        
        PdfPCell totalPrice = new PdfPCell(new Paragraph("Precio Final"));
            
        totalPrice.setColspan(2);
        table.addCell(totalPrice);
        double price = ivaCosto + precioMoto;
        table.addCell(String.valueOf(price));
        
        
        doc.add(imagen);
        doc.add(body);
        doc.add(table);
        
        doc.close();
        
        
        }catch(DocumentException | java.io.FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static double calculateIVA(double price){
        double iva = price * 0.19;
        return iva;
    }
    /*public double calculatePrice(String cant){
        int price = cant * 112000000;
        return price;
    }*/
    
    public static void crearTabla(JTable swTable){
                try{
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("tabla.pdf"));
        doc.open();
        PdfPTable tabla = new PdfPTable(swTable.getColumnCount());
        for(int i = 0; i < swTable.getColumnCount(); i++)
        {
            tabla.addCell(swTable.getColumnName(i));
        }
        for(int x = 0; x < swTable.getRowCount(); x++)
        {
            for(int y = 0; y < swTable.getColumnCount(); y++)
            {
                String valor = (swTable.getValueAt(x, y) != null) ? swTable.getValueAt(x, y).toString() : "";
                tabla.addCell(valor);
            }
        }
        doc.add(tabla);
        doc.close();

        
        }catch(DocumentException | java.io.FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
