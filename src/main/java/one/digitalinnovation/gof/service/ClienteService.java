package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
/**Interface que define o padrao Strategy no dominio de cleinte.
Com isso, se necessario, podemos ter multiplas implementações dessa mesma interface.
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
