package org.wickedsource.jxls;

import org.junit.Test;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumWithManyParametersTest {

    private Random random = new Random();

    @Test
    public void test() throws IOException {
        List<Employee> employees = generateSampleEmployeeData();
        try (InputStream is = getClass().getResourceAsStream("/jxls-test.xlsx")) {
            Path tempFile = Files.createTempFile("jxls", ".xlsx");
            try (OutputStream os = new FileOutputStream(tempFile.toFile())) {
                Context context = new Context();
                context.putVar("employees", employees);
                JxlsHelper jxls = JxlsHelper.getInstance();
//                jxls.setUseFastFormulaProcessor(false);
                jxls.processTemplate(is, os, context);
            }
            System.out.println(String.format("output file at %s", tempFile));
        }

    }

    private List<Employee> generateSampleEmployeeData() {
        List<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < 1000; i++) {
            employees.add(new Employee("Employee " + i, BigInteger.valueOf(random.nextInt(100)), BigInteger.valueOf(random.nextInt(100))));
        }
        return employees;
    }
}
