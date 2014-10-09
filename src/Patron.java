/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tann1260
 */
public class Patron {

    String name;
    Book b1, b2, b3;

    public patron(String n) {
        name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }

    public boolean hasBook(Book b) {
        if (b1 == b) {
            return true;
        } else if (b2 == b) {
            return true;
        } else if (b3 == b) {
            return true;
        } else {
            return false;
        }

    }

    public boolean returnBook(Book b) {
        if (hasBook(b)) {
            if (b1 == b) {
                b1 = null;
            } else if (b2 == b) {
                b2 = null;
            } else {
                b3 = null;
            }

        }

    }

     public boolean borrow(book b) {
        bolean canborrow = (b1 == null || b2 == null || b3 == null)
        {
            if (canborrow) {
                if (b1 == null) {
                    b1 = b;
                } else if (b2 == null) {
                    b2 = b;
                } else {
                    b3 = b;
                }
                return true;
            } else {
                return false;
            }
        }

    }
}
