package ca.gbc.petclinic.bootstrap;

import ca.gbc.petclinic.model.Owner;
import ca.gbc.petclinic.model.Vet;
import ca.gbc.petclinic.services.OwnerService;
import ca.gbc.petclinic.services.VetService;
import ca.gbc.petclinic.services.map.OwnerServiceMap;
import ca.gbc.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstname("Bruce");
        owner1.setLastname("Wayne");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Peter");
        owner2.setLastname("Parker");
        ownerService.save(owner2);

        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstname("Dinna");
        vet1.setLastname("Prince");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstname("Bruce");
        vet2.setLastname("Banner");
        vetService.save(vet2);

        System.out.println("Vets loaded..");
    }

}
