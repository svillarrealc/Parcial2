/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial.pkg2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Parcial2 implements ItemListener {
    static JComboBox<String> combo = new JComboBox<>();
    static public JFrame cuadro = new JFrame("Ejemplo ComboBox");

    public static void main(String[] args) {
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setBounds(400, 150, 600, 500);

        Usuario usuario1 = new Usuario("Juan", "Pérez", "jperez", 20, "1234", "juan@example.com");
        Usuario usuario2 = new Usuario("María", "Gómez", "mgomez", 22, "5678", "maria@example.com");

        Orden orden = new Orden();

        orden.registrarUsuario(usuario1);
        orden.registrarUsuario(usuario2);

        orden.crearGrupo("POO");
        Comida comida = new Comida("POO");

        orden.agregarCuentaaUsuario(usuario1, comida);
        orden.agregarUsuarioAGrupo(usuario2, comida);

        System.out.println("\nListando grupos:");
        orden.listarComidas(); // Cambié esto porque redSocial no está definido

        System.out.println("\nIntegrantes del grupo POO:");
        for (Usuario integrante : comida.obtenerComida()) {
            System.out.println(integrante.obtenerInfo());
        }

        combo.setBounds(60, 40, 80, 20);
        combo.addItem("Carne");
        combo.addItem("Queso");
        combo.addItem("Lechuga");
        combo.addItem("Tomate");
        combo.addItem("Huevo");
        combo.addItem("Tocineta");
        combo.addItem("Queso criollo");
        combo.addItem("Pan artesanal");
        combo.addItem("Pan industrial");
        combo.addItem("Pollo");
        combo.addItem("Salsa Roja");
        combo.addItem("Salsa ajo");
        combo.addItem("Salsa rosada");
        combo.addItem("Piña");
        combo.addItem("Pepinillo");
        combo.addItem("Maiz");
        combo.addItem("Gaseosa negra");
        combo.addItem("Gaseosa Colombiana");
        combo.addItem("Papas");
        combo.addItem("Rollos");
        combo.addItemListener(new Parcial2());
        cuadro.add(combo);

        // Crear y configurar JTextArea
        JTextArea textArea = new JTextArea("Este es un JTextArea.\nPuedes escribir texto aquí.");
        textArea.setFont(new Font("Cambria", Font.PLAIN, 20));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(false);
        cuadro.getContentPane().add(new JScrollPane(textArea));

        JLabel l1 = new JLabel("Bienvenido: " + usuario1.getnombre());
        l1.setBounds(60, 100, 200, 30);
        cuadro.add(l1);

        cuadro.setLayout(null);
        cuadro.setVisible(true);

        // Obtener entrada del usuario
        String input = JOptionPane.showInputDialog(null, "Introduce el ID:");
        System.out.println("ID Introducido: " + input);

        // Confirmar acción del usuario
        int response = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            System.out.println("El usuario desea continuar.");
        } else {
            System.out.println("El usuario no desea continuar.");
        }

        // Mostrar un mensaje simple
        JOptionPane.showMessageDialog(null, "Este es un mensaje simple.");
    }

    @Override
    public void itemStateChanged(ItemEvent evento) {
        if (evento.getSource() == combo) {
            String seleccionado = (String) combo.getSelectedItem();
            switch (seleccionado) {
                case "Carne":
                    // Lógica para Carne
                    break;
                case "Queso":
                    // Lógica para Queso
                    break;
                // Agregar más casos según sea necesario
            }
        }
    }
}


/*Caso de uso principal : GESTION DE COMIDA
Casos de uso secundario: Seleccion de frutas y vegetales(eg carnicos)

Requerimentos: Utilizar ina lista desplegable para la seccion del item (minimo 20)
utilizar joptionPane para la confirmacion de solicitudes y alertas
Gestionar excepciones

Implementar un listener que muerstre caracteristicas
*/

