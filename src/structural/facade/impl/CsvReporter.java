package structural.facade.impl;

import structural.facade.ReportData;
import structural.facade.Reporter;

public class CsvReporter implements Reporter {
    @Override
    public void generateReport(ReportData rejectedProducts) {
        System.out.println("Generating report in CSV format");
    }
}
