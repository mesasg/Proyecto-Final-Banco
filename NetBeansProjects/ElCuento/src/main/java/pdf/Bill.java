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
/**
 *
 * @author 
 */
public class Bill {
    
    public static void createBill(String name, String id, String tel, String mail) throws IOException{ //Parametro info moto
        try{
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("Factura.pdf"));
        doc.open();
        
        String costumerInfo = "Nombre: " +name+ "ID: " +id+ "Telefono";
        Paragraph title = new Paragraph("BMW Motorroad");
        Paragraph body = new Paragraph(costumerInfo);
        Image imagen = Image.getInstance("images.png");
        PdfPTable table = new PdfPTable(3);
        
        title.setAlignment(Element.ALIGN_RIGHT); // Alineación a la derecha

        // Agregar la imagen en la esquina superior
        imagen.setAbsolutePosition(50, doc.getPageSize().getHeight() - 100);
        /*CAMBIAR POSICION
        Rectangle rect = new Rectangle(
            doc.getPageSize().getWidth() - 90f, 830f,
            doc.getPageSize().getWidth() - 40f,880f);
        
        PdfContentByte cb = writer.getDirectContent();
        ColumnText ct = new ColumnText(cb);
        ct.setSimpleColumn(rect);
        ct.addElement(new Paragraph("TOTAL  //COSTO+IVA"));*/
        
        
        imagen.setAbsolutePosition(50, 50);
        table.addCell("Cantidad");
        table.addCell("Descripcion");
        table.addCell("Precio");
        
        table.addCell("1");
        //table.addCell(DESCRIPCION STRING CON LA INFO QUE SELECCIONEN);
        //table.addCell(PRECIO STRING CON LA INFO QUE SELECCIONEN);
        
        PdfPCell subtotal = new PdfPCell(new Paragraph("Subtotal"));
        subtotal.setColspan(2);
        table.addCell(subtotal);
        //table.addCell(PRECIO SEGUN SELECCIONEN);
        PdfPCell costoIVA = new PdfPCell(new Paragraph("IVA 19%"));
            
        costoIVA.setColspan(2);
        table.addCell(costoIVA);
        //table.addCell(VALOR DE IMPUESTOS SEGUN VALOR);
        
        PdfPCell totalPrice = new PdfPCell(new Paragraph("Precio Final"));
            
        totalPrice.setColspan(2);
        table.addCell(totalPrice);
        //table.addCell(PRECIO + IVA);
        
        doc.add(title);
        doc.add(body);
        doc.add(imagen);
        doc.add(table);
        //doc.add(rect);
        
        doc.close();
        
        
        }catch(DocumentException | java.io.FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    /*public static void crearTabla(JTable swTable){
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
    }*/

}
