/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tann1260
 */
import TerminalIO.*;

public class MakeEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        Employee emp;
        String name;
        int type, hours;
        double rate;
        String prompt;
        emp = new Employee();
        while (true) {
            System.out.println("Enter employee data");
            name = r.readLine(" Name(or <enter> to quit): ");
            if (!(emp.setName(name))) {
                break;
            }

            while (true) {
                prompt = " type (" + emp.getTypeRules() + "): ";
                type = r.readInt(prompt);
                if (emp.setType(type)) {
                    break;
                }
            }
            while (true) {
                prompt = "hours(" + emp.getHourRules() + "): ";
                hours = r.readInt(prompt);
                if (emp.sethours(hours)) {
                    break;
                }
            }
            while (true) {
                prompt = " Hourly rate(" + emp.getRateRules() + "): ";
                rate = r.readDouble(prompt);
                if (emp.setRate(rate)) {
                    break;
                }
            }
            System.out.print(" the weekly pay for ");
            System.out.print(emp.getName());
            System.out.println(" is $" + emp.getPay());
        }
    }

}
