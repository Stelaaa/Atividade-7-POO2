package entities;
import javax.persistence.*;

@Entity
@Table(name = "automovel")
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "ano_fabricacao")
    private int anoFabricacao;
    
    @Column(name = "ano_modelo")
    private int anoModelo;
    
    private String observacoes;
    
    private double preco;
    
    private int kilometragem;
    
    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;
    
    // Construtor
    public Automovel(int anoFabricacao, int anoModelo, String observacoes, double preco, int kilometragem, Modelo modelo) {
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.observacoes = observacoes;
        this.preco = preco;
        this.kilometragem = kilometragem;
        this.modelo = modelo;
    }
    
    // Getters and setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    // Método toString para exibir informações do automóvel
    @Override
    public String toString() {
        return "Automovel{" +
                "id=" + id +
                ", anoFabricacao=" + anoFabricacao +
                ", anoModelo=" + anoModelo +
                ", observacoes='" + observacoes + '\'' +
                ", preco=" + preco +
                ", kilometragem=" + kilometragem +
                ", modelo=" + modelo +
                '}';
    }
}
