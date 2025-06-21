package br.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private List<Pet> pets = new ArrayList<>();

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public Pet buscarPetPorNome(String nomePet) {
        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nomePet)) {
                return pet;
            }
        }
        return null;
    }

    public boolean removerPet(String nomePet) {
        Pet pet = buscarPetPorNome(nomePet);
        if (pet != null) {
            pets.remove(pet);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
