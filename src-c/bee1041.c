#include <stdio.h>

/*
 * Coordenadas de um Ponto
 *
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos 
 * ou na origem (x = y = 0).
 *
 * Representação dos quadrantes:
 *
 *        |   y
 *    Q2  |  Q1
 * -------|------- x
 *    Q3  |  Q4
 *
 * Regras:
 * - Se o ponto estiver na origem, escreva a mensagem "Origem".
 * - Se o ponto estiver sobre um dos eixos, escreva "Eixo X" ou "Eixo Y".
 *
 * Entrada:
 * - As coordenadas de um ponto (x, y), como números reais.
 *
 * Saída:
 * - O quadrante ou a posição do ponto no plano cartesiano.
 *
 * Exemplos:
 * Entrada:  4.5 -2.2        Saída: Q4
 * Entrada:  0.1  0.1        Saída: Q1
 * Entrada:  0.0  0.0        Saída: Origem
 */
//# Precisa ser corrijido 
int main()
{
    double x, y;

    scanf("%lf", &x);
    scanf("%lf", &y);

    if(x > 0.0){
        if(y > 0.0)         printf("Q1\n");
        else if(y < 0.0)    printf("Q4\n");
        else                printf("Eixo X\n");
    }else if(x < 0.0){
        if(y > 0.0)         printf("Q2\n");
        else if(y < 0.0)    printf("Q3\n");
        else                printf("Eixo X\n");
    }else{
        if(y > 0.0)         printf("Eixo Y\n");
        else if(y < 0.0)    printf("Eixo Y\n");
        else                printf("Origem\n");
    }

    return 0;
}