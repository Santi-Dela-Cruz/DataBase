package DataAcessComponent.DTO;

public class SexoDTO {
    private Integer IDSexo;
    private String Nombre;
    private String Estado;
    private String FechaCreacion;
    private String FechaModificacion;

    public SexoDTO(){}

    public SexoDTO(String nombre){
        this.Nombre = nombre;
    }

    public SexoDTO(int idSexo, String nombre, String estado, String fechaCreacion, String fechaModificacion){
        this.IDSexo = idSexo;
        this.Nombre = nombre;
        this.Estado = estado;
        this.FechaCreacion = fechaCreacion;
        this.FechaModificacion = fechaModificacion;        
    }

    @Override
    public String toString(){
        return getClass().getName()
            + "\n Id Sexo:               " + getIDSexo()
            + "\n Nombre:                " + getNombre()
            + "\n Estado:                " + getEstado()
            + "\n Fecha de creacion:     " + getFechaCreacion()
            + "\n Fecha de modificacion: " + getFechaModificacion();
    }

    public Integer getIDSexo() {
        return IDSexo;
    }

    public void setIDSexo(Integer iDSexo) {
        IDSexo = iDSexo;
    }

    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getEstado() {
        return Estado;
    }


    public void setEstado(String estado) {
        Estado = estado;
    }


    public String getFechaCreacion() {
        return FechaCreacion;
    }

  
    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }


    public String getFechaModificacion() {
        return FechaModificacion;
    }


    public void setFechaModificacion(String fechaModificacion) {
        FechaModificacion = fechaModificacion;
    }
}
