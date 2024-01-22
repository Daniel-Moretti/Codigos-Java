package br.cesul.pedidoCesul.vendedor;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private IVendedorRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity salvar(@RequestBody VendedorModel vendedorModel){

        try{

            VendedorModel vendedorBanco = repository.findByEmail(vendedorModel.getEmail());

            if (vendedorBanco != null){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já cadastrado.");
            }

            String password = BCrypt.withDefaults().hashToString(12, vendedorModel.getSenha().toCharArray());

            vendedorModel.setSenha(password);

            VendedorModel vendedor = repository.save(vendedorModel);

            return ResponseEntity.status(HttpStatus.CREATED).body(vendedor);

        } catch (Exception e){

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(vendedorModel);

        }

    }

    @PostMapping("/login")
    public ResponseEntity Login(@RequestBody VendedorModel vendedor){
        System.out.println(vendedor.getEmail());
        System.out.println(vendedor.getSenha());
         VendedorModel vendedorRetorno = repository.findByEmail(vendedor.getEmail());

         if(vendedorRetorno == null) {
             return ResponseEntity.status(HttpStatus.CONFLICT).body("Usuario e Senha incorretos.");

         }

         var verfic = BCrypt.verifyer().verify(vendedor.getSenha().toCharArray(), vendedorRetorno.getSenha());

         if (verfic.verified){
             return ResponseEntity.status(HttpStatus.OK).body(vendedorRetorno.getUuid());
         }
        return ResponseEntity.status(401).body(vendedor);
    }
}
