package phones;
import java.util.ArrayList;
import java.util.List;

import interfaces.IPod;
import interfaces.NavegadorInternet;
import interfaces.Phone;

public abstract class SmartPhone implements IPod,NavegadorInternet, Phone {
  protected List<String> historico = new ArrayList<>();
  protected List<String> musicas = new ArrayList<>();
  protected List<String> contatos = new ArrayList<>();
  protected int volumeMusica;
  protected int volumeToque;
}
