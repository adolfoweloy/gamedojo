package br.com.gamedojo.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.gamedojo.model.game.Game;

/**
 * Processa as linhas do log do jogo e configura game de forma apropriada para cada caso especifico
 * @author aeloy
 */
public abstract class LineProcessor {

    /**
     * verifica se o conteúdo casa com o padrao do processor.
     * @param content
     * @return
     */
    public boolean matches(String content) {
        Matcher matcher = getPattern().matcher(content);
        return matcher.matches();
    }

    /**
     * Retorna um Pattern compilado com uma regex que identifique o padrao do processador a ser utilizado
     * @return
     */
    public abstract Pattern getPattern();

    /**
     * processa o conteudo recebido para o game informado.
     * @param game
     */
    public abstract void process(Game game, String line);

}
