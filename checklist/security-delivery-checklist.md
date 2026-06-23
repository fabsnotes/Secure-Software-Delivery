# Security Delivery Checklist

## Keputusan Release

| Kategori | Penjelasan | Dampak saat Release |
|---|---|---|
| Blocker | Masalah serius yang tidak boleh dibawa ke production | Release wajib ditunda |
| Warning | Masalah yang perlu dicatat, tetapi masih bisa diterima sementara | Release boleh lanjut dengan catatan risiko |

## Checklist Umum Sebelum Release

| No | Checklist | Kategori | Bukti |
|---|---|---|---|
| 1 | Tidak ada secret di repository | Blocker | Hasil Gitleaks |
| 2 | Tidak ada SAST High atau Critical | Blocker | Hasil Semgrep/SAST |
| 3 | Unit test berhasil dijalankan | Blocker | Link pipeline atau log test |
| 4 | Dependency scan tidak menemukan CVE High atau Critical | Blocker | Laporan OWASP Dependency-Check |
| 5 | Artifact hasil build memiliki checksum | Blocker | File checksum |
| 6 | Deploy sudah dicoba di staging sebelum production | Blocker | Log deploy staging |
| 7 | Health check staging berhasil | Blocker | Screenshot endpoint `/health` atau log pipeline |
| 8 | DAST staging tidak menemukan High atau Critical | Blocker | Laporan OWASP ZAP |
| 9 | Production deployment sudah mendapat approval manual | Blocker | Screenshot approval GitHub Environment |
| 10 | Rollback plan tersedia | Blocker | Catatan rollback |
