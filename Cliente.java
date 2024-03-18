class Cliente {

  private String nome;
  private String cpf;
  private String celular;
  private String email;

  public Cliente(String nome, String cpf, String celular, String email) {
    this.nome = nome;
    this.cpf = cpf;
    this.celular = celular;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}