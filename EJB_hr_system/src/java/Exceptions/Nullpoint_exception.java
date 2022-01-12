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
public class Nullpoint_exception extends Exception {

    /**
     * Creates a new instance of <code>Nullpoint_exception</code> without detail
     * message.
     */
    public Nullpoint_exception() {
    }

    /**
     * Constructs an instance of <code>Nullpoint_exception</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public Nullpoint_exception(String msg) {
        super(msg);
    }
}
