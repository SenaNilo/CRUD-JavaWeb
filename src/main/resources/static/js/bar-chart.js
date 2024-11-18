const barc = document.getElementById('bar-chart');

new Chart(barc, {
    type: 'bar',
    data: {
        labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
        datasets: [{
        label: '# of Votes',
        data: [12, 19, 3, 5, 2, 3],
        borderWidth: 1
      }]
    },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});