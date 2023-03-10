package Entites;

public class Profissonal {

    private Integer Id;
    private String Nome;
    private String Email;
    private Double Salario;

    public Profissonal(){}

    public Profissonal(Integer id, String nome, String email, Double salario) {
        Id = id;
        Nome = nome;
        Email = email;
        Salario = salario;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public double aumentarSalario(double perc){
        return this.Salario+= this.Salario*(perc/100);
    }

    @Override
    public String toString() {
        return "Profissonal{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Email='" + Email + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}
