document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('emailForm');
    const status = document.getElementById('status');

    form.addEventListener('submit', async (e) => {
        e.preventDefault();

        const to = document.getElementById('to').value;
        const subject = document.getElementById('subject').value;
        const cc = document.getElementById('cc').value;
        const message = document.getElementById('message').value;

        status.textContent = 'Enviando...';

        try {
            const response = await fetch('/api/email/send', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ to, subject, cc, message }),
            });

            if (response.ok) {
                status.textContent = 'Email enviado con éxito!';
                form.reset();
            } else {
                status.textContent = 'Error al enviar el email.';
            }
        } catch (error) {
            status.textContent = 'Error al enviar el email.';
        }
    });
});
