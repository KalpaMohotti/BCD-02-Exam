/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class Dublicate_value extends Exception {

    /**
     * Creates a new instance of <code>Dublicate_value</code> without detail
     * message.
     */
    public Dublicate_value() {
    }

    /**
     * Constructs an instance of <code>Dublicate_value</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Dublicate_value(String msg) {
        super(msg);
    }
}
