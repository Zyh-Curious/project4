package Q4;
interface Repository<T> {
    int save(T data);
    T getById(int id);
}
