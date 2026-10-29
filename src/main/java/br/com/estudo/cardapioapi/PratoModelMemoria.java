package br.com.estudo.cardapioapi;

import java.math.BigDecimal;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile("memoria")
public class PratoModelMemoria extends ArmazenamentoEmMemoria {  }
