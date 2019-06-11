package com.example.tbs;

public class models {
    //models es el datainfo del ingeniero

    private Integer img;
    private String title;
    private String descripcion;
    private String adicional;
    private String cantidad;
    private String costo;
    private String disponibilidad;


    public models(){

    }
    public models( String title, String descripcion, String cantidad,  String costo, String disponibilidad, int img){

        this.title = title;
        this.descripcion=descripcion;
        this.cantidad = cantidad;
        this.costo = costo;
        this.disponibilidad = disponibilidad;
        this.img=img;

    }

    public Integer getImg(){

        return img;
    }
    public void setImg(Integer image)
    {
        this.img = img;
    }

    public String getTitle(){

        return title;
    }

    public String getCantidad(){
        return cantidad;
    }

    public String getCosto(){
        return costo;
    }

    public String getDisponibilidad(){
        return disponibilidad;
    }


    public String getDescripcion(){

        return descripcion;
    }
    public void setTitle(String title){
        this.title = title;
    }


    public void setCantidad(String cantidad){
        this.cantidad = cantidad;
    }

    public void setCosto(String costo){
        this.costo = costo;
    }


    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }


}
