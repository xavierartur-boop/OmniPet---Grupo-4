package br.com.omnipet.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "status", length = 1)
    private Character status;

    @Column(name = "email", length = 60)
    private String email;

    @Column(name = "senha", length = 30)
    private String senha;

    @Column(name = "nome", length = 60)
    private String nome;

    @Column(name = "cpf", length = 14)
    private String cpf;

    @Column(name = "tp_usuario", length = 1)
    private Character tpUsuario;

    public Usuario() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Character getTpUsuario() {
        return tpUsuario;
    }

    public void setTpUsuario(Character tpUsuario) {
        this.tpUsuario = tpUsuario;
    }
}