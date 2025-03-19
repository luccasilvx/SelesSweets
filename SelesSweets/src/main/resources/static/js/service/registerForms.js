// ouvinte de evento que dispara quando o DOM está completamente carregado
    document.addEventListener('DOMContentLoaded', function () {
        const form = document.getElementById('avaliacaoForm');

        // ouvinte de evento para o envio do formulário
        form.addEventListener('submit', function (event) {
            // Prevê comportamento padrão do formulário (não recarrega a página)
            event.preventDefault();

            const nome = document.getElementById('nome').value;
            const idade = document.getElementById('idade').value;
            const email = document.getElementById('email').value;
            const telefone = document.getElementById('telefone').value;

            //Constrói a query string com os valores dos campos, codificados para URL
            const queryParams = `?nome=${encodeURIComponent(nome)}&idade=${encodeURIComponent(idade)}&email=${encodeURIComponent(email)}&telefone=${encodeURIComponent(telefone)}`;

            // Redirecionar para a página de agradecimento com os parâmetros na URL
            window.location.href = `${form.getAttribute('action')}${queryParams}`;
        });

        // Obtém os elementos do botão de adicionar produto, input de produtos adquiridos e lista de produtos
        const addProdutoButton = document.getElementById('addProdutoButton');
        const produtosAdquiridosInput = document.getElementById('produtosAdquiridos');
        const produtosList = document.getElementById('produtosList');

        // ouvinte de evento ao botão de adicionar produto
        addProdutoButton.addEventListener('click', function () {
            const produtoValue = produtosAdquiridosInput.value.trim();

            if (produtoValue) {
                // cria novo elemento de lista e define seu conteúdo como o valor do produto
                const li = document.createElement('li');
                li.textContent = produtoValue;

                // cria botão de remoção e define seu conteúdo como 'X'
                const removeButton = document.createElement('span');
                removeButton.textContent = 'X';
                removeButton.classList.add('remove-button');

                // ouvinte de evento ao botão de remoção para remover o item da lista
                removeButton.addEventListener('click', function () {
                    produtosList.removeChild(li);
                });

                // adiciona botão de remoção ao item da lista e o item da lista à lista de produtos
                li.appendChild(removeButton);
                produtosList.appendChild(li);

                // limpa o valor do input de produtos adquiridos
                produtosAdquiridosInput.value = '';
            }
        });

        // obtém todos elementos com classe 'animated-item'
        const animatedItems = document.querySelectorAll('.animated-item');

        // adiciona classe 'show' para cada item animado após pequeno atraso
        animatedItems.forEach((item, index) => {
            setTimeout(() => {
                item.classList.add('show');
            }, index * 300); // ajusta o intervalo de atraso
        });
    });