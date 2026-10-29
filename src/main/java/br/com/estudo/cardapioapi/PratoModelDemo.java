package br.com.estudo.cardapioapi;

import java.math.BigDecimal;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile("demo")
public class PratoModelDemo extends ArmazenamentoEmMemoria { public PratoModelDemo() { criar(new Prato(null, "Lasanha", "Massa com molho e queijo", new BigDecimal("35.0"))); } }
