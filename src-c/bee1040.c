/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com
pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for
maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame:
" acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2).
Imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais) ou "Aluno reprovado." (caso a média tenha ficado 4.9 ou menos).
Para estes dois casos (aprovado ou reprovado após ter pego exame), apresente na última linha uma mensagem "Media final: " seguido da média
final para esse aluno.
*/

#include <stdio.h>
// notas
float n1, n2, n3, n4;
// pesos
int p1 = 2, p2 = 3, p3 = 4, p4 = 1;

float media;

int main()
{
    scanf("%f %f %f %f", &n1, &n2, &n3, &n4);

    media = ((p1 * n1) + (p2 * n2) + (p3 * n3) + (p4 * n4)) / (p1 + p2 + p3 + p4);
    printf("Media: %.1f\n", media);

    if (media >= 7)
    {
        printf("Aluno aprovado.");
    }
    else if (media < 5)
    {
        printf("Aluno reprovado.");
    }
    else if (media >= 5 && media < 7)
    {
        printf("Aluno em exame.\n");
        float notaExam;
        scanf("%f", &notaExam);
        printf("Nota do exame: %.1f\n", notaExam);
        media = (media + notaExam) / 2;

        if (media >= 5)
        {
            printf("Aluno aprovado.\n");
            printf("Media final: %.1f", media);
        }
        else
        {
            printf("Aluno reprovado.\n");
            printf("Media final: %.1f", media);
        }
    }

    return 0;
}