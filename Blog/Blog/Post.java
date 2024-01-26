package Blog;

public class Post {
    private String titulo;
	private String escritor;
	private String categoria;
	
	public Post(String titulo, String escritor, String categoria){
		this.titulo =  titulo;
		this.escritor = escritor;
		this.categoria = categoria;		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return escritor;
	}

	public void setAutor(String autor) {
		this.escritor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}