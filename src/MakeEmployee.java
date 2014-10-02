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
        KeyboardReader kr = new KeyboardReader();
        String name = kr.readLine("enter name");
        System.out.println(name);
    }

}
