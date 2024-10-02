package structural.facade;

public class ReportFacade {
    private final Reporter excelReporter;
    private final Reporter csvReporter;

    public ReportFacade(Reporter excelReporter, Reporter csvReporter) {
        this.excelReporter = excelReporter;
        this.csvReporter = csvReporter;
    }
    public void generateExcelReport(ReportData reportData){
        excelReporter.generateReport(reportData);
    }

    public void generateCsvReport(ReportData reportData){
        csvReporter.generateReport(reportData);
    }
}
