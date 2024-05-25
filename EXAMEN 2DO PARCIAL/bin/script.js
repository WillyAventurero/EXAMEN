document.addEventListener('DOMContentLoaded', function() {
    const miembrosForm = document.getElementById('miembrosForm');
    const miembrosList = document.getElementById('miembrosList');

    miembrosForm.addEventListener('submit', function(event) {
        event.preventDefault();

        const nombre = document.getElementById('nombre').value;
        const edad = document.getElementById('edad').value;
        const unidad = document.getElementById('unidad').value;

        if (nombre && edad && unidad) {
            const li = document.createElement('li');
            li.textContent = `Nombre: ${nombre}, Edad: ${edad}, Unidad: ${unidad}`;

            const deleteButton = document.createElement('button');
            deleteButton.textContent = 'Eliminar';
            deleteButton.addEventListener('click', function() {
                miembrosList.removeChild(li);
            });

            li.appendChild(deleteButton);
            miembrosList.appendChild(li);

            miembrosForm.reset();
        }
    });
});
