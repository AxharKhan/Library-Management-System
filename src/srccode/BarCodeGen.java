/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package srccode;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.output.OutputException;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.awt.print.PrinterException;
import java.awt.print.Printable;

public class BarCodeGen implements Printable {
    public static void main(String[] args) {
        BarCodeGen barCodePrinter = new BarCodeGen();
        barCodePrinter.execute();
    }

    private void execute() {
        PageFormat pFormat = new PageFormat();
        pFormat.setOrientation(PageFormat.LANDSCAPE);
        PrinterJob pJob = PrinterJob.getPrinterJob();
        pJob.setPrintable(this, pFormat);
        // PrintServiceAttribute printerName = new PrinterName("ZebraLP2824", null);
        // PrintServiceAttribute printerName = new PrinterName("HP Deskjet D1300
        // series", null);
        // AttributeSet attr = new
        // HashPrintServiceAttributeSet(printerName);
        // PrintService[] printServiceArray =
        // PrintServiceLookup.lookupPrintServices(null, attr);
        // PrintService printService = printServiceArray[0];
        // pJob.setPrintService(printService);
        boolean doPrint = pJob.printDialog();
        if (doPrint) {
            try {
                pJob.print();
            } catch (PrinterException e) {
                System.err.println("Error occurred in execute");
            }
        } else {
            System.out.println("You Cancelled the print");
        }
    }

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
        // adjust the following variables for positioning and size of barcode printout
        double scale = 0.57;
        int barHeight = 40;
        int barWidth = 2;
        int x = 50;
        int y = 50;
        Graphics2D g2 = (Graphics2D) graphics;
        g2.translate((int) (pageFormat.getImageableX()), (int) (pageFormat.getImageableY()));
        g2.scale(scale, scale);
        if (pageIndex == 0) {
            Barcode barcode = null;
            try {
                barcode = BarcodeFactory.createEAN13("400763000011");
            } catch (BarcodeException e) {
                e.printStackTrace();
            }
            try {
                barcode.setResolution(96);
                barcode.setBarHeight(barHeight);
                barcode.setBarWidth(barWidth);
                barcode.draw(g2, x, y);
            } catch (OutputException e) {
                e.printStackTrace();
            }
            return Printable.PAGE_EXISTS;
        } else {
            return Printable.NO_SUCH_PAGE;
        }
    }
}
