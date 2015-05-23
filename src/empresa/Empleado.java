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
    private double salarioBruto;
    private String cedula;
    
    public Empleado(){}
    
    public Empleado(String cedula, double salarioBruto){
        this.cedula=cedula;
        this.salarioBruto=salarioBruto;
    }
    
    public void setSalarioBruto(double paSalarioBruto){
        salarioBruto = paSalarioBruto;
    }
    
    public double getSalarioBruto(){
        return salarioBruto;
    }
    public String getIdEmpleado(){
        return cedula;
    }
    
    public double calcularSalarioReal(){
        return salarioBruto*(1-0.08);
    }
}
