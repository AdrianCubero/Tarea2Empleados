package my.webapp.employee;

//<editor-fold defaultstate="collapsed" desc="/*comment*/">
/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
//</editor-fold>
public class Employee {
private final int id;
private final String nombre;
private final String departamento;
public Employee(int id, String nombre, String departamento) {
this.id = id;
this.nombre = nombre;
this.departamento = departamento;
}
public int getId() {
return id;
}
public String getNombre() {
return nombre;
}
public String getDepartamento() {
return departamento;
}
}

