const graficoDonut = document.getElementById("dough-chart")

function showDonut(lsValores){

    var names = [];
    var values = [];

    for(let objLs of lsValores){
        names.push(Object.keys(objLs)[0]) // pegar a "ChaVe" od obj como Real, Dolar etc
        values.push(objLs[Object.keys(objLs)[0]]) // Pegar o valor - Dinheiro, da chave correspondente
    }
        
    
    const data = {
        labels: names,
        datasets: [{
            label: 'Patrimônio Total',
            data: values,
            backgroundColor: [
                'rgb(34, 139, 34)',
                'rgb(255, 0, 0)',
                'rgb(0, 0, 255)',
                'rgb(255, 105, 180)',
                'rgb(255, 223, 0)',
                'rgb(255, 204, 0)',
                'rgb(0, 255, 255)',
                'rgb(245, 245, 220)'
            ],
            hoverOffset:4                                
        }]
    };
    
    new Chart(graficoDonut, {
        type: 'doughnut',
        data: data,
    })
}
