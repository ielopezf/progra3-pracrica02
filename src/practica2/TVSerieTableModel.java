/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author irmal
 */
public class TVSerieTableModel extends AbstractTableModel {
    List<TVSerie> serie = new ArrayList<TVSerie> ();
    @Override
    public int getRowCount() {return serie.size();}//getrow

    @Override
    public int getColumnCount() {return 5;}//getcolum
    @Override
   public Object getValueAt(int rowIndex,int columnIndex) {
    TVSerie t = serie.get(rowIndex);
    Object valor = null;
    //busca valor por columna
    switch(columnIndex){
        case 0: valor = t.codigo;
        break;
        case 1: valor = t.nombre;
        break;
        case 2: valor = t.creador;
        break;
        case 3: valor = t.estreno;
        break;
        case 4: valor = t.duracion;
        break;
        
        }//switch
    return valor;
    }//fin getValue
}
