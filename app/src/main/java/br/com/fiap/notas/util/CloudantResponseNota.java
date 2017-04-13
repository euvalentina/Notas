package br.com.fiap.notas.util;

/**
 * Created by logonrm on 12/04/2017.
 */
import java.util.List;

public class CloudantResponseNota {

    private Integer totalRows;
    private Integer offset;
    private List<Row> rows = null;

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

}