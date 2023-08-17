inherit cargo
include uplink.inc
#require ../../conf/distro/include/rust_versions.inc
#SRC_URI += "git://github.com/sai-kiran-y/uplink.git;protocol=https;branch=yocto"
#SRC_URI += "git://github.com/sai-kiran-y/rumqttc.git;protocol=https;branch=main"

#SRC_URI = "\ git://github.com/sai-kiran-y/;protocol=https;branch=yocto; destsuffix=uplink.git\
#			 git://github.com/sai-kiran-y/;protocol=https;branch=main;rev=127d07801cf9d87a01656a61be8990b92c3b2ec7;destsuffix=rumqtt.git"
#git://github.com/sai-kiran-y/rumqtt.git;protocol=https;branch=main;rev=9d8ce7c167271a3b49077b4a198c9a7a6b481b59

#SRC_URI[uplink.md5sum] = "04c00632931a29cd0041a316e2ec76aa"
#SRCREV = "d5d04df9ab1fa9205a0c032ca49d57c1b9e6fa27"
LIC_FILES_CHKSUM="file://LICENSE;md5=04c00632931a29cd0041a316e2ec76aa"
#CARGO_SRC_DIR = "uplink"

SRC_URI += "git://github.com/sai-kiran-y/uplink.git;protocol=https;branch=yocto;rev=d5d04df9ab1fa9205a0c032ca49d57c1b9e6fa27 \
    git://github.com/TimeToogo/remote-pty;protocol=https;nobranch=1;name=remote-pty-common;destsuffix=remote-pty-common;rev=c6ac8995b5f449878465512b58fa2b7b9cb9fbc5 \
    git://github.com/TimeToogo/remote-pty;protocol=https;nobranch=1;name=remote-pty-master;destsuffix=remote-pty-master;rev=c6ac8995b5f449878465512b58fa2b7b9cb9fbc5 \
    git://github.com/bytebeamio/rumqtt;protocol=https;nobranch=1;name=rumqttc;destsuffix=rumqttc;rev=0fc5ce175443bfac8592dfd704233a6ec5d77e83 \
    git://github.com/bytebeamio/tunshell.git;protocol=https;nobranch=1;name=tunshell-client;destsuffix=tunshell-client;rev=71363fdf79374a05c247576d62e12541dd682fec \
    git://github.com/bytebeamio/tunshell.git;protocol=https;nobranch=1;name=tunshell-shared;destsuffix=tunshell-shared;rev=71363fdf79374a05c247576d62e12541dd682fec \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/afl/0.8.0 \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/anyhow/1.0.71 \
    crate://crates.io/async-trait/0.1.68 \
    crate://crates.io/async-tungstenite/0.8.0 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/axum-core/0.3.4 \
    crate://crates.io/axum/0.6.18 \
    crate://crates.io/base64/0.11.0 \
    crate://crates.io/base64/0.12.3 \
    crate://crates.io/base64/0.21.2 \
    crate://crates.io/bincode/2.0.0-rc.3 \
    crate://crates.io/bincode_derive/2.0.0-rc.3 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/0.5.6 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/config/0.13.3 \
    crate://crates.io/console_error_panic_hook/0.1.7 \
    crate://crates.io/console_log/0.2.2 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cpufeatures/0.2.7 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-deque/0.8.3 \
    crate://crates.io/crossbeam-epoch/0.9.14 \
    crate://crates.io/crossbeam-utils/0.8.15 \
    crate://crates.io/crossterm/0.23.2 \
    crate://crates.io/crossterm_winapi/0.9.0 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/enum-iterator-derive/1.2.1 \
    crate://crates.io/enum-iterator/1.4.1 \
    crate://crates.io/env_logger/0.7.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/filedescriptor/0.7.3 \
    crate://crates.io/filetime/0.2.21 \
    crate://crates.io/flate2/1.0.26 \
    crate://crates.io/flume/0.10.14 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.2.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-test/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/futures/0.3.28 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/getset/0.1.2 \
    crate://crates.io/git2/0.16.1 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/h2/0.3.19 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/home/0.5.5 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.9 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/hyper-rustls/0.24.0 \
    crate://crates.io/hyper/0.14.26 \
    crate://crates.io/idna/0.4.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/input_buffer/0.3.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/ioctl-rs/0.1.6 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/ipnet/2.7.2 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/jobserver/0.1.26 \
    crate://crates.io/js-sys/0.3.63 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.146 \
    crate://crates.io/libgit2-sys/0.14.2+1.5.1 \
    crate://crates.io/libz-sys/1.1.9 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/lock_api/0.4.10 \
    crate://crates.io/log/0.4.18 \
    crate://crates.io/lz4_flex/0.10.0 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matchit/0.7.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.8.0 \
    crate://crates.io/memory_units/0.4.0 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio-named-pipes/0.1.7 \
    crate://crates.io/mio-uds/0.6.8 \
    crate://crates.io/mio/0.6.23 \
    crate://crates.io/mio/0.8.8 \
    crate://crates.io/miow/0.2.2 \
    crate://crates.io/miow/0.3.7 \
    crate://crates.io/mqttbytes/0.1.0 \
    crate://crates.io/nanorand/0.7.0 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/net2/0.2.38 \
    crate://crates.io/no-std-net/0.6.0 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/ntapi/0.4.1 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-src/111.26.0+1.1.1u \
    crate://crates.io/openssl-sys/0.9.88 \
    crate://crates.io/openssl/0.10.54 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.8 \
    crate://crates.io/pathdiff/0.2.1 \
    crate://crates.io/percent-encoding/2.3.0 \
    crate://crates.io/pin-project-internal/0.4.30 \
    crate://crates.io/pin-project-internal/1.1.0 \
    crate://crates.io/pin-project-lite/0.1.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/0.4.30 \
    crate://crates.io/pin-project/1.1.0 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/pnet_base/0.33.0 \
    crate://crates.io/pnet_macros/0.33.0 \
    crate://crates.io/pnet_macros_support/0.33.0 \
    crate://crates.io/pnet_packet/0.33.0 \
    crate://crates.io/portable-pty/0.3.1 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/pretty-bytes/0.2.2 \
    crate://crates.io/pretty_env_logger/0.4.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.60 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rayon-core/1.11.0 \
    crate://crates.io/rayon/1.7.0 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex-syntax/0.7.2 \
    crate://crates.io/regex/1.8.4 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/reqwest/0.11.18 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.19 \
    crate://crates.io/rustls-native-certs/0.6.2 \
    crate://crates.io/rustls-pemfile/1.0.2 \
    crate://crates.io/rustls-webpki/0.100.1 \
    crate://crates.io/rustls/0.17.0 \
    crate://crates.io/rustls/0.21.1 \
    crate://crates.io/rustversion/1.0.12 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/schannel/0.1.21 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/sct/0.6.1 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/seahash/4.1.0 \
    crate://crates.io/security-framework-sys/2.9.0 \
    crate://crates.io/security-framework/2.9.1 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde/1.0.164 \
    crate://crates.io/serde_derive/1.0.164 \
    crate://crates.io/serde_json/1.0.96 \
    crate://crates.io/serde_path_to_error/0.1.11 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serial-core/0.4.0 \
    crate://crates.io/serial-unix/0.4.0 \
    crate://crates.io/serial-windows/0.4.0 \
    crate://crates.io/serial/0.4.0 \
    crate://crates.io/sha-1/0.9.8 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shared_library/0.1.9 \
    crate://crates.io/shell-words/0.1.0 \
    crate://crates.io/signal-hook-mio/0.2.3 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/signal-hook-tokio/0.3.1 \
    crate://crates.io/signal-hook/0.3.15 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/socket2/0.5.3 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/structopt-derive/0.4.18 \
    crate://crates.io/structopt/0.3.26 \
    crate://crates.io/surge-ping/0.8.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.18 \
    crate://crates.io/sync_wrapper/0.1.2 \
    crate://crates.io/sysinfo/0.26.9 \
    crate://crates.io/sysinfo/0.27.8 \
    crate://crates.io/tar/0.4.38 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/tempfile/3.6.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/termios/0.2.2 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time-core/0.1.1 \
    crate://crates.io/time-macros/0.2.9 \
    crate://crates.io/time/0.3.22 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-compat-02/0.2.0 \
    crate://crates.io/tokio-macros/0.2.6 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio-native-tls/0.1.0 \
    crate://crates.io/tokio-rustls/0.13.1 \
    crate://crates.io/tokio-rustls/0.24.1 \
    crate://crates.io/tokio-stream/0.1.14 \
    crate://crates.io/tokio-util/0.3.1 \
    crate://crates.io/tokio-util/0.7.8 \
    crate://crates.io/tokio/0.2.25 \
    crate://crates.io/tokio/1.28.2 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/tower-layer/0.3.2 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tower/0.4.13 \
    crate://crates.io/tracing-attributes/0.1.24 \
    crate://crates.io/tracing-core/0.1.31 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.14 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/tungstenite/0.11.1 \
    crate://crates.io/twox-hash/1.6.3 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/uds_windows/0.1.6 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-segmentation/1.10.1 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/url/2.4.0 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/vergen/7.5.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/virtue/0.0.13 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.86 \
    crate://crates.io/wasm-bindgen-futures/0.4.36 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.86 \
    crate://crates.io/wasm-bindgen-macro/0.2.86 \
    crate://crates.io/wasm-bindgen-shared/0.2.86 \
    crate://crates.io/wasm-bindgen/0.2.86 \
    crate://crates.io/wasm-streams/0.2.3 \
    crate://crates.io/web-sys/0.3.63 \
    crate://crates.io/webpki-roots/0.19.0 \
    crate://crates.io/webpki-roots/0.22.6 \
    crate://crates.io/webpki/0.21.4 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/wee_alloc/0.4.5 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/winreg/0.10.1 \
    crate://crates.io/ws2_32-sys/0.2.1 \
    crate://crates.io/xattr/0.2.3 \
    crate://crates.io/xdg/2.5.0 \
"



#SRC_URI[uplink.md5sum] = "04c00632931a29cd0041a316e2ec76aa"
#SRCREV="1b777db5f997d75ff6b651961c5aa3bf927eec7c"
#LIC_FILES_CHKSUM="file://LICENSE;md5=04c00632931a29cd0041a316e2ec76aa"
#LIC_FILES_CHKSUM="file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

#SRC_URI += "\
#    file://0001-enable-LTO.patch \
#    "

SUMMARY = "Bytebeam uplink testing..."
HOMEPAGE = "https://github.com/sai-kiran-y/uplink"
LICENSE = "MIT | Apache-2.0"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"
do_compile[network] = "1"