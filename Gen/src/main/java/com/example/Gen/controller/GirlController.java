package com.example.Gen.controller;

import com.example.Gen.module.Gf;
import com.example.Gen.service.GirlImplementationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Gf.com")
public class GirlController
{
    @Autowired
    GirlImplementationSer girlImplementationSer;
    @PostMapping("/create")
    public void create(@RequestBody Gf g)
    {
        girlImplementationSer.create(g);
    }
    @GetMapping("/getAll")
    public List<Gf> getAll()
    {
        return girlImplementationSer.getAll();
    }
    @PutMapping("/update")
    public void update(@RequestBody Gf g)
    {
        girlImplementationSer.update(g);
    }
    @DeleteMapping("/delete/{Id}")
    public void deleteById(@PathVariable Integer id)
    {
        girlImplementationSer.deleteById(id);
    }

}
