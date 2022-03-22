package com.personales.exampleh2db.controllers;

import com.personales.exampleh2db.entitys.Usuario;
import com.personales.exampleh2db.services.IUsuarioService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @created 22/03/2022 - 13:52
 * @autor Pruebas_Horus
 **/
@RunWith(MockitoJUnitRunner.class)
class UsuarioRestControllerTest {

    MockMvc mockMvc;

    @Mock
    IUsuarioService iUsuarioService;

    @InjectMocks
    UsuarioRestController usuarioRestController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        usuarioRestController = new UsuarioRestController(iUsuarioService);
        mockMvc = MockMvcBuilders.standaloneSetup(usuarioRestController).build();
    }

    @AfterEach
    void tearDown() {
        Mockito.validateMockitoUsage();
        Mockito.clearAllCaches();
    }

    @Test
    void getUsuarios() throws Exception {
        List<Usuario> usuarioList = new ArrayList<>();
        List<Usuario> responseList = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setName("Julio");
        usuario.setSexo("M");
        usuario.setEdad(29);
        usuarioList.add(usuario);
        Mockito.when(iUsuarioService.findAll()).thenReturn(usuarioList);
        String uri = "/api/usuarios";
        MvcResult mvcResult = mockMvc.perform(get(uri)).andReturn();

        assertFalse(mvcResult.getResponse().getContentAsString().isEmpty());
        assertEquals(200, mvcResult.getResponse().getStatus());

    }

    @Test
    void getUsuarioById() {
    }
}