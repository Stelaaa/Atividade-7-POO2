package entities;

import javax.persistence.*;

@Entity
@Table(name = "modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descricao;
    
    private int potencia;
    
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;
    
    // Construtor
    public Modelo(String descricao, int potencia, Marca marca) {
        this.descricao = descricao;
        this.potencia = potencia;
        this.marca = marca;
    }
    
    // Getters and setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    // Método toString para exibir informações do modelo
    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", potencia=" + potencia +
                ", marca=" + marca +
                '}';
    }
}
