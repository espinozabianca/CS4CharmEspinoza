/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exercise09charmespinozabianca;

/**
 *
 * @author espin
 */
public class AlreadyCapturedException extends Exception{
    public AlreadyCapturedException() {
    }
    
    public AlreadyCapturedException(String msg) {
        super(msg);
    }
}
