/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author family
 */
public class Empleado {
    double salarioBruto;
    String cedula;
    
    public void setSalarioBruto(double paSalarioBruto){
        salarioBruto = paSalarioBruto;
    }
    
    public double getSalarioBruto(){
        return salarioBruto;
    }
    
    public double calcularSalarioReal(){
        return salarioBruto*(1+0.8);
    }
}
