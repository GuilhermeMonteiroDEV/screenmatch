package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Representa os dados de um episódio de uma série.
 * <p>
 * Esta classe utiliza anotações do Jackson para mapeamento JSON.
 * </p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(
        /**
         * O título do episódio.
         * <p>
         * Mapeado a partir da propriedade JSON "Title".
         * </p>
         */
        @JsonAlias("Title") String titulo,

        /**
         * O número do episódio.
         * <p>
         * Mapeado a partir da propriedade JSON "Episode".
         * </p>
         */
        @JsonAlias("Episode") Integer numero,

        /**
         * A avaliação do episódio no IMDb.
         * <p>
         * Mapeado a partir da propriedade JSON "imdbRating".
         * </p>
         */
        @JsonAlias("imdbRating") String avaliacao,

        /**
         * A data de lançamento do episódio.
         * <p>
         * Mapeado a partir da propriedade JSON "Released".
         * </p>
         */
        @JsonAlias("Released") String dataLancamento) {
}
