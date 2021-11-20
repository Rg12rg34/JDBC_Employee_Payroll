package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import java.sql.SQLException;
import java.util.List;


public class EmployeePayrollServiceTest {
    //Test Case To Check If Database Connection IS Properly Established Or Not
    @Test
    public void EmployeePayrollDataRetrievedDFromDB_MatchEmployeeCount() throws SQLException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.getConnection();
    }

    //Test Case To Check Whether Data Is Properly Retrieved Or Not From Database
    @Test
    public void retrieveDataFromDB() {
        EmployeePayrollService employeePayrollService=new EmployeePayrollService();
        List<EmployeeData> employee = employeePayrollService.retrieveData();
        Assert.assertEquals(5, employee.size());
    }

    //Test Case To Check Whether Salary Is Updated Or Not In Database
    @Test
    public void updateSalaryFromDB() {
        EmployeePayrollService employeePayrollService=new EmployeePayrollService();
        List<EmployeeData> employee = employeePayrollService.retrieveData();
        employeePayrollService.updateSalary();
    }
    //Test Case To Check Whether Salary Is Updated Or Not In Database Using prepared Statement
    @Test
    public void updateSalaryFromDBusing_prepareStatement() {
        EmployeePayrollService employeePayRollService=new EmployeePayrollService();
        employeePayRollService.updateUsing_PreparedStatement("Terisa");

    }

    //Test Case To Retrieve Data Between Mentioned Range
    @Test
    public void retrieveData_betweenRange() {
        EmployeePayrollService employeePayRollService=new EmployeePayrollService();
        employeePayRollService.retrieveData_inBetween_Range();
    }

}