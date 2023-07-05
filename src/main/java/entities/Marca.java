package entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {

	 private Long id;

	    private String nome;

	    @OneToMany(mappedBy = "marca")
	    private List<Modelo> modelos;

	    public Marca(String nome) {
	        this.nome = nome;
	    }


	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public List<Modelo> getModelos() {
	        return modelos;
	    }

	    public void setModelos(List<Modelo> modelos) {
	        this.modelos = modelos;
	    }

	    @Override
	    public String toString() {
	        return "Marca{" +
	                "id=" + id +
	                ", nome='" + nome + '\'' +
	                ", modelos=" + modelos +
	                '}';
	    }
}
