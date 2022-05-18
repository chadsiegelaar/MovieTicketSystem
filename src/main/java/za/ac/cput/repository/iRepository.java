package za.ac.cput.repository;

public interface iRepository<T,Name> {
    T create(T Name);

    T read(String Name );

    T update(T t);

    boolean delete(String Name);
}
