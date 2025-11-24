package FunctionalInterface;
interface DataExporter {
    void exportCSV();
    void exportPDF();

    default void exportJSON() {
        System.out.println("Exporting as JSON (default)");
    }
}

class ReportExporter implements DataExporter {
    public void exportCSV() { System.out.println("CSV Exported"); }
    public void exportPDF() { System.out.println("PDF Exported"); }
}

public class DataExportDemo {
    public static void main(String[] args) {
        DataExporter ex = new ReportExporter();
        ex.exportCSV();
        ex.exportPDF();
        ex.exportJSON();
    }
}
