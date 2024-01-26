package Blog;

public class TestaBlog {
    public static void main(String[] args) {
        Blog blog = new Blog("Terra", "Vinício");
		Blog blog1= new Blog("GG", "Gaybriel");
		
		Post post = new Post("Carro Vida", "Gaybriel", "Sla");
		Post post1 = new Post("Bueno", "Vinício", "SlaNature");
		
		blog.adicionarPost(post1);
		blog1.adicionarPost(post);
		
		blog.mostrarPosts();
		blog1.mostrarPosts();
    }
}