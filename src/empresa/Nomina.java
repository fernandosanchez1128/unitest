/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import empresa.Empleado;
import java.util.ArrayList;

/**
 *
 * @author JuanD
 */
public class Nomina {
    public double calcularSueldoBruto(Empleado objEmpleado){
        double sueldoBruto=objEmpleado.getSalarioBruto();
        return sueldoBruto;
    }
    
    public double calcularSueldoReal(Empleado objEmpleado){
        double sueldoReal=objEmpleado.calcularSalarioReal();
        return sueldoReal;
    }
    
    public double[] calcularSueldosEmpleados(Empleado[] objEmpleados){
        int tamano=objEmpleados.length;
        double[] salarios = new double[tamano];
        Empleado empleado;
        for(int i=0; i<tamano; i++){
            empleado=objEmpleados[i];
            salarios[i]=calcularSueldoReal(empleado);
        }
        return salarios;
    }
    
    public double calcularSumaSueldos(Empleado[] objEmpleados){
        int tamano=objEmpleados.length;
        double sumaSalarios=0.0;
        Empleado empleado;
        for(int i=0; i<tamano; i++){
            empleado=objEmpleados[i];
            sumaSalarios+=calcularSueldoReal(empleado);
        }
        return sumaSalarios;
    }
    
    public double calcularPromedioSueldos(Empleado[] objEmpleados){
        int tamano=objEmpleados.length;
        double sumaSalarios=calcularSumaSueldos(objEmpleados);
        double promedio=sumaSalarios/tamano;
        return promedio;
    }
    
    public ArrayList obtenerIdEmpleados(Empleado[] objEmpleados){
        ArrayList<String> idsEmpleados = new ArrayList<>();
        int tamano=objEmpleados.length;
        Empleado empleado;
        for(int i=0; i<tamano; i++){
            empleado=objEmpleados[i];
            idsEmpleados.add(empleado.getIdEmpleado());
        }
        return idsEmpleados;
    }
    
    public double calcularTotalAPagar(Empleado[] objEmpleados){
        int tamano=objEmpleados.length;
        double sumaSalarios=0.0;
        Empleado empleado;
        for(int i=0; i<tamano; i++){
            empleado=objEmpleados[i];
            sumaSalarios+=empleado.getSalarioBruto();
        }
        return sumaSalarios;
    }
    
    public Empleado empleadoGanaMenos(Empleado[] objEmpleados){
        Empleado ganaMenos=new Empleado();
        double menorSalario=0.0;
        int tamano=objEmpleados.length;
        Empleado empleado;
        for(int i=0; tamano>=i; i++){
            empleado=objEmpleados[i];
            if (i==0){
                ganaMenos=empleado;
                menorSalario=ganaMenos.getSalarioBruto();
            }else{
                if (menorSalario>empleado.getSalarioBruto()){
                    ganaMenos=empleado;
                    menorSalario=ganaMenos.getSalarioBruto();
                }
            }
        }
        return ganaMenos;
    }
    
}
