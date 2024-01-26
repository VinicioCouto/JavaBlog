package Blog;

import java.util.ArrayList;

public class Blog {
    private String nome;
	private String escritor;
	private ArrayList<Post> posts;
	
	public Blog(String nome, String escritor) {
		this.nome = nome;
		this.escritor = escritor;
		this.posts = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return escritor;
	}

	public void setAutor(String autor) {
		this.escritor = autor;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	
	public void adicionarPost(Post post) {
		posts.add(post);
		System.out.println("O Blog "+nome+" adicionou o post "+post.getTitulo());
	}
	
	public void mostrarPosts() {
		System.out.println("Os posts do blog "+nome+" são: ");
		for(Post post : posts) {
			System.out.println(post.getTitulo());
		}
	}
}