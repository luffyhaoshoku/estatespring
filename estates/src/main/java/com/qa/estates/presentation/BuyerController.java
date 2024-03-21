package com.qa.estates.presentation;

import com.qa.estates.domain.BuyerDomain;
import com.qa.estates.dto.BuyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    private BuyerService service;

    public BuyerController(BuyerService service) {
        this.service = service;
    }


    @GetMapping("/getAllBuyer")
    public List<BuyerDomain> getAll() {
        return this.service.getAll();
    }

    @PostMapping("/createBuyer")
    public BuyerDomain createBuyer(@RequestBody BuyerDomain Buyer) {
        return this.service.createBuyer(Buyer);
    }

    @DeleteMapping("/removeBuyer/{id}")
    public BuyerDomain removeBuyer(int id) {
        return this.service.removeBuyer(id);
    }

    @PatchMapping("/updateBuyer/{id}")
    public BuyerDomain updateBuyer(@PathVariable int id,
                                   @RequestParam(required = false) String Fname,
                                   @RequestParam(required = false) String Surname,
                                   @RequestParam(required = false) Integer age,
                                   @RequestParam(required = false) String Email,
                                   @RequestParam(required = false) Double Telephone) {
        BuyerDomain toUpdate = this.service.updateBuyer(id, Fname, Surname, age, Email, Telephone);

        if (Fname != null) toUpdate.setFname(Fname);
        if (Surname != null) toUpdate.setSurname(Surname);
        if (age != null) toUpdate.setAge(age);
        if (Email != null) toUpdate.setEmail(Email);
        if (Telephone != null) toUpdate.setTelephone(Telephone);

        return toUpdate;
    }

    @GetMapping("getById/{id}")
    public BuyerDomain getById(int id) {
        return this.service.getbyId(id);
    }
}

